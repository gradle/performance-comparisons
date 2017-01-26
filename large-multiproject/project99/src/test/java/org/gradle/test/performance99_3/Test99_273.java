package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_273 {
    private final Production99_273 production = new Production99_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}