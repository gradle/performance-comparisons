package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_252 {
    private final Production94_252 production = new Production94_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}