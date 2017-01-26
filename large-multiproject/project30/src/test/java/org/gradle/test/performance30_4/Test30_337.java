package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_337 {
    private final Production30_337 production = new Production30_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}