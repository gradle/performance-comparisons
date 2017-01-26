package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_230 {
    private final Production90_230 production = new Production90_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}