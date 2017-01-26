package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41183 {
    private final Productionnull_41183 production = new Productionnull_41183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}