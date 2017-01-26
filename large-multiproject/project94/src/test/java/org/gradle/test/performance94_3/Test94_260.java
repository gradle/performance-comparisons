package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_260 {
    private final Production94_260 production = new Production94_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}