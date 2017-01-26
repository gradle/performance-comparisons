package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_173 {
    private final Production90_173 production = new Production90_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}