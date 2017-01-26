package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_462 {
    private final Production90_462 production = new Production90_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}