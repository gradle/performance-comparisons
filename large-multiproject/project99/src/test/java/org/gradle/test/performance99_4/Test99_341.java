package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_341 {
    private final Production99_341 production = new Production99_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}