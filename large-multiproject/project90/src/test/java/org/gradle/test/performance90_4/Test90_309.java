package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_309 {
    private final Production90_309 production = new Production90_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}