package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_347 {
    private final Production86_347 production = new Production86_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}