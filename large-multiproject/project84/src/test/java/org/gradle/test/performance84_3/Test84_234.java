package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_234 {
    private final Production84_234 production = new Production84_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}