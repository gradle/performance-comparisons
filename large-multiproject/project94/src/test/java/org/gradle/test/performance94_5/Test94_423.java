package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_423 {
    private final Production94_423 production = new Production94_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}