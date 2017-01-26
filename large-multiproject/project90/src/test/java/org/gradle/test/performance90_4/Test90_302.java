package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_302 {
    private final Production90_302 production = new Production90_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}