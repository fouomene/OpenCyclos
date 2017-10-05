package nl.strohalm.cyclos.entities.members.imports;

import nl.strohalm.cyclos.entities.converters.StringValuedEnumAttributeConverter;
import nl.strohalm.cyclos.entities.members.brokerings.BrokerCommissionContract;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class ImportedMemberStatusAttributeConverter extends StringValuedEnumAttributeConverter<ImportedMember.Status> {
}
