package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_431 {
    private final Production90_431 production = new Production90_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}