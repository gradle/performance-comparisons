package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_265 {
    private final Production90_265 production = new Production90_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}