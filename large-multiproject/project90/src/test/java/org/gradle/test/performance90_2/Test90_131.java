package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_131 {
    private final Production90_131 production = new Production90_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}