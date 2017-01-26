package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_90 {
    private final Production94_90 production = new Production94_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}