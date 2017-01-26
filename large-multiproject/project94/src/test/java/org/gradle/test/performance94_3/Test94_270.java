package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_270 {
    private final Production94_270 production = new Production94_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}