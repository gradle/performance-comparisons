package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_90 {
    private final Production30_90 production = new Production30_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}