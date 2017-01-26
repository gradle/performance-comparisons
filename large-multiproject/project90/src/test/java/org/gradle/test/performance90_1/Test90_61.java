package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_61 {
    private final Production90_61 production = new Production90_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}