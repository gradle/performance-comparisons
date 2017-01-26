package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_497 {
    private final Production90_497 production = new Production90_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}