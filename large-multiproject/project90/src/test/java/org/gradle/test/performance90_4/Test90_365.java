package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_365 {
    private final Production90_365 production = new Production90_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}