package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_306 {
    private final Production90_306 production = new Production90_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}