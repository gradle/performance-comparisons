package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_6 {
    private final Production94_6 production = new Production94_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}