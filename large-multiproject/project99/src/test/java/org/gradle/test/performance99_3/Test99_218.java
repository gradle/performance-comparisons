package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_218 {
    private final Production99_218 production = new Production99_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}