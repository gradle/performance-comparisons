package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_213 {
    private final Production99_213 production = new Production99_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}