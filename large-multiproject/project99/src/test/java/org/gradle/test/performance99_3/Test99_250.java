package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_250 {
    private final Production99_250 production = new Production99_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}