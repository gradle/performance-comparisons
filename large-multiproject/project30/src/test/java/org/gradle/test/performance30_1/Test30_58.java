package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_58 {
    private final Production30_58 production = new Production30_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}