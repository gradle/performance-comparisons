package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_108 {
    private final Production99_108 production = new Production99_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}