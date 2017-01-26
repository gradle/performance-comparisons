package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_242 {
    private final Production94_242 production = new Production94_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}