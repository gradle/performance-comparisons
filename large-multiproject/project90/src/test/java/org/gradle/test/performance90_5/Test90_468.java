package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_468 {
    private final Production90_468 production = new Production90_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}