package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_164 {
    private final Production94_164 production = new Production94_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}