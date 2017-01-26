package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_57 {
    private final Production94_57 production = new Production94_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}