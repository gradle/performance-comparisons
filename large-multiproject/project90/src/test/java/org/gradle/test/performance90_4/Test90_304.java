package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_304 {
    private final Production90_304 production = new Production90_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}