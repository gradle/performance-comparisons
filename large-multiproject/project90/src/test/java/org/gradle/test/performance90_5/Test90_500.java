package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_500 {
    private final Production90_500 production = new Production90_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}