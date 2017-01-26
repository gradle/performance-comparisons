package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_39 {
    private final Production90_39 production = new Production90_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}