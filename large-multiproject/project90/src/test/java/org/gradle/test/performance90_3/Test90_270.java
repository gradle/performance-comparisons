package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_270 {
    private final Production90_270 production = new Production90_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}