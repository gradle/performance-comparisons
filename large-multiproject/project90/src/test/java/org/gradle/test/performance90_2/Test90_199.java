package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_199 {
    private final Production90_199 production = new Production90_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}