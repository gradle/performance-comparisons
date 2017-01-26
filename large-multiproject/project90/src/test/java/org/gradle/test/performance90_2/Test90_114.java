package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_114 {
    private final Production90_114 production = new Production90_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}