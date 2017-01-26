package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_69 {
    private final Production99_69 production = new Production99_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}