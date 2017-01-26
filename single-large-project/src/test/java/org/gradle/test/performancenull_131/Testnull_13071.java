package org.gradle.test.performancenull_131;

import static org.junit.Assert.*;

public class Testnull_13071 {
    private final Productionnull_13071 production = new Productionnull_13071("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}