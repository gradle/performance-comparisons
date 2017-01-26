package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19873 {
    private final Productionnull_19873 production = new Productionnull_19873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}