package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_290 {
    private final Production90_290 production = new Production90_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}