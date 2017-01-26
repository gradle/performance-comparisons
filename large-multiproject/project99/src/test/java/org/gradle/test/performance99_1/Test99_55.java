package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_55 {
    private final Production99_55 production = new Production99_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}