package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_160 {
    private final Production99_160 production = new Production99_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}