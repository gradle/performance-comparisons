package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_150 {
    private final Production94_150 production = new Production94_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}