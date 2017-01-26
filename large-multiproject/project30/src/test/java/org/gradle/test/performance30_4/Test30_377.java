package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_377 {
    private final Production30_377 production = new Production30_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}