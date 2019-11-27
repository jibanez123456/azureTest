package com.juanonlab.azure.service;

import java.util.List;

import com.juanonlab.azure.pojo.Refran;

public interface RefranService {

	public Refran getBestRefran();

	public Refran getRefranRandom();

	public List<Refran> getRefranes(int numeroRefranes);

	public int getnumRefranes();
}
