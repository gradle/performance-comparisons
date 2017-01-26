package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_274 {
    private final Production94_274 production = new Production94_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}