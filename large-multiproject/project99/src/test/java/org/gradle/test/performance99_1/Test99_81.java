package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_81 {
    private final Production99_81 production = new Production99_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}