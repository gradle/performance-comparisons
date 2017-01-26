package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_32 {
    private final Production99_32 production = new Production99_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}