package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_129 {
    private final Production99_129 production = new Production99_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}