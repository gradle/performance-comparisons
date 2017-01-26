package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_141 {
    private final Production99_141 production = new Production99_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}