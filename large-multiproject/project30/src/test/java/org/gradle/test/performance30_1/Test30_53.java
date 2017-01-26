package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_53 {
    private final Production30_53 production = new Production30_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}