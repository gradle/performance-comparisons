package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_190 {
    private final Production99_190 production = new Production99_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}