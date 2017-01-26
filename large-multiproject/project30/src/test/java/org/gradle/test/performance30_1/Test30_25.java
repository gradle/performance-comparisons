package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_25 {
    private final Production30_25 production = new Production30_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}