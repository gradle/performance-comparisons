package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_418 {
    private final Production90_418 production = new Production90_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}