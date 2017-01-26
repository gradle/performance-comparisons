package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_479 {
    private final Production99_479 production = new Production99_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}