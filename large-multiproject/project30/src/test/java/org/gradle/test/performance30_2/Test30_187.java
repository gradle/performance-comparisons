package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_187 {
    private final Production30_187 production = new Production30_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}