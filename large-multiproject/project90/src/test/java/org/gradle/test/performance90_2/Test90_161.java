package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_161 {
    private final Production90_161 production = new Production90_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}