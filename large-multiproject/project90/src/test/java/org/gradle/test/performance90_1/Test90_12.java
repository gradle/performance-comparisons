package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_12 {
    private final Production90_12 production = new Production90_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}