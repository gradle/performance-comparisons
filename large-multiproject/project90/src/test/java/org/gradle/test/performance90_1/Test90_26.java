package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_26 {
    private final Production90_26 production = new Production90_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}