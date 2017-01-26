package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_152 {
    private final Production90_152 production = new Production90_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}