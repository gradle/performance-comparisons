package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_30 {
    private final Production90_30 production = new Production90_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}