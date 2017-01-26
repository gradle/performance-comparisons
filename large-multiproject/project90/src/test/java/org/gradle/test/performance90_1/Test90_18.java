package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_18 {
    private final Production90_18 production = new Production90_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}