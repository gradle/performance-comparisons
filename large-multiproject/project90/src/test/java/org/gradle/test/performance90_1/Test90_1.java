package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_1 {
    private final Production90_1 production = new Production90_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}