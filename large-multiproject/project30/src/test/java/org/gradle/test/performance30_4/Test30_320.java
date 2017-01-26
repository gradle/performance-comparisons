package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_320 {
    private final Production30_320 production = new Production30_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}