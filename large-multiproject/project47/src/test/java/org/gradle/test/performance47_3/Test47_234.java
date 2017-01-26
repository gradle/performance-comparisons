package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_234 {
    private final Production47_234 production = new Production47_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}