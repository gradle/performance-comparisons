package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_168 {
    private final Production86_168 production = new Production86_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}