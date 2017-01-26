package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_204 {
    private final Production94_204 production = new Production94_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}