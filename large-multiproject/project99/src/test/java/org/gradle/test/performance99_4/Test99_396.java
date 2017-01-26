package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_396 {
    private final Production99_396 production = new Production99_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}