package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_23 {
    private final Production99_23 production = new Production99_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}