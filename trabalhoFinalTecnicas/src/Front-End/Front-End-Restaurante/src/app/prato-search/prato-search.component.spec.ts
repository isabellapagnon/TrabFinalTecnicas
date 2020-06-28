import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PratoSearchComponent } from './prato-search.component';

describe('PratoSearchComponent', () => {
  let component: PratoSearchComponent;
  let fixture: ComponentFixture<PratoSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PratoSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PratoSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
