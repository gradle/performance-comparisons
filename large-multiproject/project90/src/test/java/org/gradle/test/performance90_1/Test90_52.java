package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_52 {
    private final Production90_52 production = new Production90_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}