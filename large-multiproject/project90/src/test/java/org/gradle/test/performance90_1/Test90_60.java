package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_60 {
    private final Production90_60 production = new Production90_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}