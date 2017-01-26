package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_301 {
    private final Production90_301 production = new Production90_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}