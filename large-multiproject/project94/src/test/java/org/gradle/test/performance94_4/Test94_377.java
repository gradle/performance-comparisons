package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_377 {
    private final Production94_377 production = new Production94_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}