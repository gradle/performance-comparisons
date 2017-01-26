package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_94 {
    private final Production99_94 production = new Production99_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}