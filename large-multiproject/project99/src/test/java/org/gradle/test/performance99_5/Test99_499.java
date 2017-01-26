package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_499 {
    private final Production99_499 production = new Production99_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}