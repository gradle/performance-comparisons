package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_15 {
    private final Production90_15 production = new Production90_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}