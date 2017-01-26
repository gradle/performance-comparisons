package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_193 {
    private final Production90_193 production = new Production90_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}