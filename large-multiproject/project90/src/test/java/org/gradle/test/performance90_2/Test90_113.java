package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_113 {
    private final Production90_113 production = new Production90_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}