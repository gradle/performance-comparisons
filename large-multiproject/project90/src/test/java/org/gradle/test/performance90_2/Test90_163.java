package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_163 {
    private final Production90_163 production = new Production90_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}