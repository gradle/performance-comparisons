package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_6 {
    private final Production90_6 production = new Production90_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}