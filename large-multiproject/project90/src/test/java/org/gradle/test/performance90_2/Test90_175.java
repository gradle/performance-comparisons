package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_175 {
    private final Production90_175 production = new Production90_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}