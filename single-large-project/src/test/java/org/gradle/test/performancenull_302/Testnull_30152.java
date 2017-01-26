package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30152 {
    private final Productionnull_30152 production = new Productionnull_30152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}