package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_337 {
    private final Production90_337 production = new Production90_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}