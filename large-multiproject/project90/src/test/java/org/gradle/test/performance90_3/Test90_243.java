package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_243 {
    private final Production90_243 production = new Production90_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}