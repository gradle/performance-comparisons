package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_204 {
    private final Production90_204 production = new Production90_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}