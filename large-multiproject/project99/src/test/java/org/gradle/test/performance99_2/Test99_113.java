package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_113 {
    private final Production99_113 production = new Production99_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}