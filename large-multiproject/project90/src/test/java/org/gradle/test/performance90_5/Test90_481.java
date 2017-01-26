package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_481 {
    private final Production90_481 production = new Production90_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}