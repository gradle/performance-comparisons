package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_311 {
    private final Production99_311 production = new Production99_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}