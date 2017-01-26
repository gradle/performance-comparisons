package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_42 {
    private final Production90_42 production = new Production90_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}