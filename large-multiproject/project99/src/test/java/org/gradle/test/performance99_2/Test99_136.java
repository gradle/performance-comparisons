package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_136 {
    private final Production99_136 production = new Production99_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}