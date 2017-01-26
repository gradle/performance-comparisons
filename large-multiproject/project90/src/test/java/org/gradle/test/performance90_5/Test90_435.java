package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_435 {
    private final Production90_435 production = new Production90_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}