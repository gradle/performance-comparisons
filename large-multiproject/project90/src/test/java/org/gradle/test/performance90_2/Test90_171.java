package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_171 {
    private final Production90_171 production = new Production90_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}