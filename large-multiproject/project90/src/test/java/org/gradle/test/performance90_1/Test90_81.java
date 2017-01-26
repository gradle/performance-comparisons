package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_81 {
    private final Production90_81 production = new Production90_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}