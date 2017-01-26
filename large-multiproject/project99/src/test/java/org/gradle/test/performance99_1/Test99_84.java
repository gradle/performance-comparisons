package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_84 {
    private final Production99_84 production = new Production99_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}