package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_343 {
    private final Production94_343 production = new Production94_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}