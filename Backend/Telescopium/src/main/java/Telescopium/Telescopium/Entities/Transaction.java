package Telescopium.Telescopium.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Transaction {
  @Id @GeneratedValue private String codeTrans;

  @NonNull private String nomMod;

  @NonNull private String nomMag;

  @NonNull private LocalDate date;

  @NonNull private Integer quantiteVendue;

  @OneToMany(mappedBy = "magasinTransaction", cascade = CascadeType.ALL)
  private Set<Magasin> magasins = new HashSet<>();

  @OneToMany(mappedBy = "modelTransaction", cascade = CascadeType.ALL)
  private Set<Model> models = new HashSet<>();
}
