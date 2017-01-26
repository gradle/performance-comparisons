package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_234 {
    private final Production12_234 production = new Production12_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}