package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_474 {
    private final Production90_474 production = new Production90_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}