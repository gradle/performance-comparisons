package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_59 {
    private final Production90_59 production = new Production90_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}