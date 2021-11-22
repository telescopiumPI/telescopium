package Telescopium.Telescopium.Entities;

import Telescopium.Telescopium.Enumeration.RegionMagasin;
import Telescopium.Telescopium.Enumeration.VilleMagasin;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class Magasin {
  @Id @GeneratedValue private String code_mag;

  @NonNull private String nom_mag;

  @NonNull private RegionMagasin region_mag;

  @NonNull private VilleMagasin ville_mag;

  @ManyToOne
  @JoinColumn(name = "id_transaction", referencedColumnName = "codeTrans")
  private Transaction magasinTransaction;
}
