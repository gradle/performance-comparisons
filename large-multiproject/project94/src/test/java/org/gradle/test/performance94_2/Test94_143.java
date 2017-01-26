package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_143 {
    private final Production94_143 production = new Production94_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}