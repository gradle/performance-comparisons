package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_435 {
    private final Production99_435 production = new Production99_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}