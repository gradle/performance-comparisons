package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_479 {
    private final Production90_479 production = new Production90_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}