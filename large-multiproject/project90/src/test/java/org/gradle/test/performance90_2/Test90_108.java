package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_108 {
    private final Production90_108 production = new Production90_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}