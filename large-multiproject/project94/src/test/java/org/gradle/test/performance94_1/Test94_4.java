package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_4 {
    private final Production94_4 production = new Production94_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}