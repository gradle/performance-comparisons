package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_455 {
    private final Production94_455 production = new Production94_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}