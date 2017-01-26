package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_8 {
    private final Production30_8 production = new Production30_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}