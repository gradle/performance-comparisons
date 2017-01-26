package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_388 {
    private final Production86_388 production = new Production86_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}