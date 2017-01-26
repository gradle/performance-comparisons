package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_5 {
    private final Production90_5 production = new Production90_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}