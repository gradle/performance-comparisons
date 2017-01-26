package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_65 {
    private final Production90_65 production = new Production90_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}