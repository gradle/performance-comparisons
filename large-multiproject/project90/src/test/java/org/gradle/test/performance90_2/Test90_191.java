package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_191 {
    private final Production90_191 production = new Production90_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}