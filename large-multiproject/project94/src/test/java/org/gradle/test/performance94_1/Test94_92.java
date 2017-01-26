package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_92 {
    private final Production94_92 production = new Production94_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}