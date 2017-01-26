package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_345 {
    private final Production99_345 production = new Production99_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}