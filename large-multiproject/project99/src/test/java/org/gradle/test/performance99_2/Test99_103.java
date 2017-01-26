package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_103 {
    private final Production99_103 production = new Production99_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}