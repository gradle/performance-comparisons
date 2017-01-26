package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_406 {
    private final Production86_406 production = new Production86_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}