package com.company.mapstruct;

import com.company.mapstruct.pojo.SimpleDestination;
import com.company.mapstruct.pojo.SimpleSource;
import org.mapstruct.Mapper;

@Mapper
public interface SimpleSourceDestinationMapper {

    SimpleDestination sourceToDestination(SimpleSource source);

    SimpleSource destinationToSource(SimpleDestination destination);
}
