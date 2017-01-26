package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_403 {
    private final Production90_403 production = new Production90_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}