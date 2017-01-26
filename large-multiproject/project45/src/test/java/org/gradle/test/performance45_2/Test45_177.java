package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_177 {
    private final Production45_177 production = new Production45_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}