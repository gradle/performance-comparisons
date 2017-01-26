package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_47 {
    private final Production94_47 production = new Production94_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}