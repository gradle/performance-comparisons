package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_482 {
    private final Production90_482 production = new Production90_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}