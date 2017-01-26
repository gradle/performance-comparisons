package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_89 {
    private final Production90_89 production = new Production90_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}