package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_203 {
    private final Production90_203 production = new Production90_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}