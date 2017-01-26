package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_423 {
    private final Production90_423 production = new Production90_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}