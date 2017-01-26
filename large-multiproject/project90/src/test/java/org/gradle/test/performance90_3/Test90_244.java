package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_244 {
    private final Production90_244 production = new Production90_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}