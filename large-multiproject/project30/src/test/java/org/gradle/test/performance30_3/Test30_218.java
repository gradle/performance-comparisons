package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_218 {
    private final Production30_218 production = new Production30_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}