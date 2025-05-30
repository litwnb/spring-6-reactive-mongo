package com.litwnb.reactivemongo.mapper;

import com.litwnb.reactivemongo.domain.Beer;
import com.litwnb.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
