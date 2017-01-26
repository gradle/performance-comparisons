package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30490 {
    private final Productionnull_30490 production = new Productionnull_30490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}