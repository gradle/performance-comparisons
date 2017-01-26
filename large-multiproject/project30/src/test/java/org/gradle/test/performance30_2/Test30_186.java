package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_186 {
    private final Production30_186 production = new Production30_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}