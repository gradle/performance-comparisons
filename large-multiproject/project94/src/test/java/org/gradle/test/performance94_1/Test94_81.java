package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_81 {
    private final Production94_81 production = new Production94_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}