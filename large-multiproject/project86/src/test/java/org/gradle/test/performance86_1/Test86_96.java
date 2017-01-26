package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_96 {
    private final Production86_96 production = new Production86_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}