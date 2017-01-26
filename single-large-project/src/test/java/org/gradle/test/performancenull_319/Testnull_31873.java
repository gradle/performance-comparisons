package org.gradle.test.performancenull_319;

import static org.junit.Assert.*;

public class Testnull_31873 {
    private final Productionnull_31873 production = new Productionnull_31873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}