package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_454 {
    private final Production34_454 production = new Production34_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}