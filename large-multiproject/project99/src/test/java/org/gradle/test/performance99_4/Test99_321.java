package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_321 {
    private final Production99_321 production = new Production99_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}