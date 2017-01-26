package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_197 {
    private final Production45_197 production = new Production45_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}