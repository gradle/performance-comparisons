package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_356 {
    private final Production86_356 production = new Production86_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}