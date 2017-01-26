package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_161 {
    private final Production99_161 production = new Production99_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}