package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44903 {
    private final Productionnull_44903 production = new Productionnull_44903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}