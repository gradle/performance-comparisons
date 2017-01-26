package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_164 {
    private final Production99_164 production = new Production99_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}