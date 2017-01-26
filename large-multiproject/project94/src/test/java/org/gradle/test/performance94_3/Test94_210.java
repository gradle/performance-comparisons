package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_210 {
    private final Production94_210 production = new Production94_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}