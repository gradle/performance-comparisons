package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_101 {
    private final Production45_101 production = new Production45_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}