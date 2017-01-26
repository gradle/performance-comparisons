package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_180 {
    private final Production99_180 production = new Production99_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}