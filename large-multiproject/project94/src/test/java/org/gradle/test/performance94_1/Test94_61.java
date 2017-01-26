package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_61 {
    private final Production94_61 production = new Production94_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}