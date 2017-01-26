package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_33 {
    private final Production90_33 production = new Production90_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}