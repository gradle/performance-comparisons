package org.gradle.test.performancenull_432;

import static org.junit.Assert.*;

public class Testnull_43181 {
    private final Productionnull_43181 production = new Productionnull_43181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}