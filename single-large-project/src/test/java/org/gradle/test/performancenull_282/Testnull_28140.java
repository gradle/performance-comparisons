package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28140 {
    private final Productionnull_28140 production = new Productionnull_28140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}