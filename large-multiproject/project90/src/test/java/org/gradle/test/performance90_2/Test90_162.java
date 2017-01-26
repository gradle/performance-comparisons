package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_162 {
    private final Production90_162 production = new Production90_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}