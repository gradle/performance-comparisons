package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_217 {
    private final Production90_217 production = new Production90_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}