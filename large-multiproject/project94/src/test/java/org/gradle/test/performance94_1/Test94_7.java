package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_7 {
    private final Production94_7 production = new Production94_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}