package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_63 {
    private final Production90_63 production = new Production90_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}