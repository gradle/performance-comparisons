package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_405 {
    private final Production90_405 production = new Production90_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}