package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_27 {
    private final Production86_27 production = new Production86_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}