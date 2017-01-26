package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_231 {
    private final Production90_231 production = new Production90_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}