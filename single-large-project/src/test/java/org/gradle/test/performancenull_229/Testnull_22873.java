package org.gradle.test.performancenull_229;

import static org.junit.Assert.*;

public class Testnull_22873 {
    private final Productionnull_22873 production = new Productionnull_22873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}