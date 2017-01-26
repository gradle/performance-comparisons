package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_149 {
    private final Production99_149 production = new Production99_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}