package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_162 {
    private final Production94_162 production = new Production94_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}