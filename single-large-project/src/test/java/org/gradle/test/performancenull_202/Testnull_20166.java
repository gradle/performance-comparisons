package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20166 {
    private final Productionnull_20166 production = new Productionnull_20166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}