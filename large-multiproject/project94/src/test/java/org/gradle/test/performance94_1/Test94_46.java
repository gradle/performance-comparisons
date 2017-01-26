package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_46 {
    private final Production94_46 production = new Production94_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}