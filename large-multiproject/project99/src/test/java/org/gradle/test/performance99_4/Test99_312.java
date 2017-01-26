package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_312 {
    private final Production99_312 production = new Production99_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}