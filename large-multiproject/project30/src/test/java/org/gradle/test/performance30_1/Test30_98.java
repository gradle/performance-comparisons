package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_98 {
    private final Production30_98 production = new Production30_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}