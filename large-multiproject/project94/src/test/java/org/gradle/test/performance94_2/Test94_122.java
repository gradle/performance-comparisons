package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_122 {
    private final Production94_122 production = new Production94_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}