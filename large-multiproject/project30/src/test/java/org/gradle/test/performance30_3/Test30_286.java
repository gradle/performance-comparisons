package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_286 {
    private final Production30_286 production = new Production30_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}