package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_25 {
    private final Production90_25 production = new Production90_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}