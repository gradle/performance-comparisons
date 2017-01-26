package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_260 {
    private final Production30_260 production = new Production30_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}