package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_258 {
    private final Production90_258 production = new Production90_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}