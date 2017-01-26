package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_234 {
    private final Production86_234 production = new Production86_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}