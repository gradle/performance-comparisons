package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_196 {
    private final Production30_196 production = new Production30_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}