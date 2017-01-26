package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_301 {
    private final Production49_301 production = new Production49_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}