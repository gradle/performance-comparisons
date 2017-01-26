package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_83 {
    private final Production99_83 production = new Production99_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}