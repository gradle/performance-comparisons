package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_500 {
    private final Production80_500 production = new Production80_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}