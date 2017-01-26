package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_471 {
    private final Production90_471 production = new Production90_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}