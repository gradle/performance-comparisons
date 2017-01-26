package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_135 {
    private final Production90_135 production = new Production90_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}