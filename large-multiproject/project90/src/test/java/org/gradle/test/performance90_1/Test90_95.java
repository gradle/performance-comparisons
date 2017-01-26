package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_95 {
    private final Production90_95 production = new Production90_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}