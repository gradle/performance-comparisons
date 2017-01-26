package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_81 {
    private final Production30_81 production = new Production30_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}