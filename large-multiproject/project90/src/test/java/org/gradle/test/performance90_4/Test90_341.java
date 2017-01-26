package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_341 {
    private final Production90_341 production = new Production90_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}