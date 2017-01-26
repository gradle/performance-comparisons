package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_7 {
    private final Production90_7 production = new Production90_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}