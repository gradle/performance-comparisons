package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_171 {
    private final Production94_171 production = new Production94_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}