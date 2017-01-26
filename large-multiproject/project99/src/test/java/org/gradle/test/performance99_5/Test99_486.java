package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_486 {
    private final Production99_486 production = new Production99_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}