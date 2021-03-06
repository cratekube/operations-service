package io.cratekube.operations.api

import io.cratekube.operations.model.EnvironmentCluster

/**
 * Base API for operational interactions.
 */
interface OperationsApi {
  /**
   * Creates cluster infrastructure and bootstraps cluster.
   *
   * @param name {@code non-empty} cluster name
   */
  void bootstrapEnvironmentCluster(String name)

  /**
   * Returns all environment clusters
   *
   * @return environment clusters
   */
  Map<String, EnvironmentCluster> getEnvironmentClusters()
}
