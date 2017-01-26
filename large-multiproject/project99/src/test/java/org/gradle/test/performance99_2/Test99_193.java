package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_193 {
    private final Production99_193 production = new Production99_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}