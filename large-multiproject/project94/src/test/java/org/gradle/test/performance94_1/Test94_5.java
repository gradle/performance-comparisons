package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_5 {
    private final Production94_5 production = new Production94_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}