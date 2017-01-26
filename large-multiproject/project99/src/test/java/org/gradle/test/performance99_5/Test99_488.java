package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_488 {
    private final Production99_488 production = new Production99_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}