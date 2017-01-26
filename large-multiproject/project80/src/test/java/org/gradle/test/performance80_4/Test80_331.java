package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_331 {
    private final Production80_331 production = new Production80_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}