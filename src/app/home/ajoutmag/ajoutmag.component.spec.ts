import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutmagComponent } from './ajoutmag.component';

describe('AjoutmagComponent', () => {
  let component: AjoutmagComponent;
  let fixture: ComponentFixture<AjoutmagComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutmagComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutmagComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
