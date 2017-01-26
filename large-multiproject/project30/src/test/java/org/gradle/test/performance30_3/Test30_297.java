package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_297 {
    private final Production30_297 production = new Production30_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}