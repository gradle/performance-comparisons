package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_116 {
    private final Production99_116 production = new Production99_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}