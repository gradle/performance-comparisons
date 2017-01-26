package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_313 {
    private final Production90_313 production = new Production90_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}