package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_48 {
    private final Production90_48 production = new Production90_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}