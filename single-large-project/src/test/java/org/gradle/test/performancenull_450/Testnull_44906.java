package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44906 {
    private final Productionnull_44906 production = new Productionnull_44906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}