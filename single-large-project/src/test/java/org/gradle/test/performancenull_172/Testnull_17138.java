package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17138 {
    private final Productionnull_17138 production = new Productionnull_17138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}