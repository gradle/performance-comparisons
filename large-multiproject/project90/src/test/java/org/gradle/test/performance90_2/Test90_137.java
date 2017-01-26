package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_137 {
    private final Production90_137 production = new Production90_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}