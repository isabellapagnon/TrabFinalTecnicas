import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PratoDetailComponent } from './prato-detail.component';

describe('PratoDetailComponent', () => {
  let component: PratoDetailComponent;
  let fixture: ComponentFixture<PratoDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PratoDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PratoDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
