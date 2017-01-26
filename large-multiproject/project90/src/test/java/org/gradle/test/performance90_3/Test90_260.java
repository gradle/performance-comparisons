package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_260 {
    private final Production90_260 production = new Production90_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}