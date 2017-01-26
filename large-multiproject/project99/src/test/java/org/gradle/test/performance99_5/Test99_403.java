package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_403 {
    private final Production99_403 production = new Production99_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}