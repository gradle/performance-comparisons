package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_65 {
    private final Production30_65 production = new Production30_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}