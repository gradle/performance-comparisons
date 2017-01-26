package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_165 {
    private final Production99_165 production = new Production99_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}