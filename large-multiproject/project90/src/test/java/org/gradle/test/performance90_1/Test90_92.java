package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_92 {
    private final Production90_92 production = new Production90_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}