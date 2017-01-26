package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_437 {
    private final Production93_437 production = new Production93_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}