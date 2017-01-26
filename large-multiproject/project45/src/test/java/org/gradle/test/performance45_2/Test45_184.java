package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_184 {
    private final Production45_184 production = new Production45_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}