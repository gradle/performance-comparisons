package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_99 {
    private final Production86_99 production = new Production86_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}