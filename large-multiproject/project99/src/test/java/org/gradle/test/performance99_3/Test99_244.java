package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_244 {
    private final Production99_244 production = new Production99_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}