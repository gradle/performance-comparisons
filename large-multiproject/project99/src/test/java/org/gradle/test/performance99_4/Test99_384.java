package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_384 {
    private final Production99_384 production = new Production99_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}