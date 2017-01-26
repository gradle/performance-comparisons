package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_330 {
    private final Production30_330 production = new Production30_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}