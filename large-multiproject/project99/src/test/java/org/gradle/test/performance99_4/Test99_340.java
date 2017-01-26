package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_340 {
    private final Production99_340 production = new Production99_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}