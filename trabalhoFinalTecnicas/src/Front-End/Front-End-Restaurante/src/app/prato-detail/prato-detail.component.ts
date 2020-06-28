import { Component, OnInit, Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { Prato } from '../prato';
import { PratoService } from '../prato.service';

@Component({
  selector: 'app-prato-detail',
  templateUrl: './prato-detail.component.html',
  styleUrls: ['./prato-detail.component.css']
})
export class PratoDetailComponent implements OnInit {
  @Input() prato: Prato;

  constructor(
    private route: ActivatedRoute,
    private pratoService: PratoService,
    private location: Location
  ) { }

  ngOnInit() {
    this.getPrato();
  }

  getPrato(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.pratoService.getPrato(id)
      .subscribe(prato => this.prato = prato);
  }

  goBack(): void {
    this.location.back();
  }

  save(): void {
    this.pratoService.updatePrato(this.prato)
      .subscribe(() => this.goBack());
  }

}
