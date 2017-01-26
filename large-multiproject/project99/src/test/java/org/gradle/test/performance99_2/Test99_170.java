package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_170 {
    private final Production99_170 production = new Production99_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}