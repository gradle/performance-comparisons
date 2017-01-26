package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_248 {
    private final Production45_248 production = new Production45_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}