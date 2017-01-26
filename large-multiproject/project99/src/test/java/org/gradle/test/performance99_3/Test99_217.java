package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_217 {
    private final Production99_217 production = new Production99_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}