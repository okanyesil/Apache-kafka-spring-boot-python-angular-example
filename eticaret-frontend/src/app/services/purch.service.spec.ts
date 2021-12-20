import { TestBed } from '@angular/core/testing';

import { PurchService } from './purch.service';

describe('PurchService', () => {
  let service: PurchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PurchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
