package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_395 {
    private final Production90_395 production = new Production90_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}