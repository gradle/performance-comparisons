package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_37 {
    private final Production94_37 production = new Production94_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}