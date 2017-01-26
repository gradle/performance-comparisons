package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_343 {
    private final Production90_343 production = new Production90_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}