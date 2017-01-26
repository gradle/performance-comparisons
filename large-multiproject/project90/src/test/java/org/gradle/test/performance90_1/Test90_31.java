package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_31 {
    private final Production90_31 production = new Production90_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}