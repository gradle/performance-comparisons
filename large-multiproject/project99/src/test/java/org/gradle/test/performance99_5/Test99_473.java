package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_473 {
    private final Production99_473 production = new Production99_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}