package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_64 {
    private final Production99_64 production = new Production99_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}