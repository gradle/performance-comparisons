package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_446 {
    private final Production90_446 production = new Production90_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}