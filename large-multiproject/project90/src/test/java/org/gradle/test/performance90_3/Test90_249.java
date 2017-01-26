package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_249 {
    private final Production90_249 production = new Production90_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}