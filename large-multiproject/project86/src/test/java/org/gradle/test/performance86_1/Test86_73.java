package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_73 {
    private final Production86_73 production = new Production86_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}