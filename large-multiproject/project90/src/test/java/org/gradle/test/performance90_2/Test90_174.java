package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_174 {
    private final Production90_174 production = new Production90_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}