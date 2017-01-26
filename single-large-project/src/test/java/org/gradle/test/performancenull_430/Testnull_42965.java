package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42965 {
    private final Productionnull_42965 production = new Productionnull_42965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}