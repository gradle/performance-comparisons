package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_142 {
    private final Production90_142 production = new Production90_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}