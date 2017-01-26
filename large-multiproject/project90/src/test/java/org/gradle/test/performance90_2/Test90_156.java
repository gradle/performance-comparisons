package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_156 {
    private final Production90_156 production = new Production90_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}