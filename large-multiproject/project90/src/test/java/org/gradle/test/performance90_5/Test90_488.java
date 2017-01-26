package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_488 {
    private final Production90_488 production = new Production90_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}