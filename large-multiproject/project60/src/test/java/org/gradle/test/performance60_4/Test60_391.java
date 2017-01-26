package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_391 {
    private final Production60_391 production = new Production60_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}