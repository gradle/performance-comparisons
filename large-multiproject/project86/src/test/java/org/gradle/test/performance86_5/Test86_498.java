package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_498 {
    private final Production86_498 production = new Production86_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}