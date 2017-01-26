package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_47 {
    private final Production30_47 production = new Production30_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}