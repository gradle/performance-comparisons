package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_232 {
    private final Production99_232 production = new Production99_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}