package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30469 {
    private final Productionnull_30469 production = new Productionnull_30469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}