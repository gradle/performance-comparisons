package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_450 {
    private final Production90_450 production = new Production90_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}