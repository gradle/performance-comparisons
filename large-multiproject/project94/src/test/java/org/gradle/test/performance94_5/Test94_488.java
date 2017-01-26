package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_488 {
    private final Production94_488 production = new Production94_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}