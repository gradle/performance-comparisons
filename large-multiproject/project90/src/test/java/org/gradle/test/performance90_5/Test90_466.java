package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_466 {
    private final Production90_466 production = new Production90_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}