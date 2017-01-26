package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_334 {
    private final Production99_334 production = new Production99_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}