package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_343 {
    private final Production99_343 production = new Production99_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}