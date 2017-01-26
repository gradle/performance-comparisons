package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_237 {
    private final Production94_237 production = new Production94_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}