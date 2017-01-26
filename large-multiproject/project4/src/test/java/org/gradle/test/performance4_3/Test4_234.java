package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_234 {
    private final Production4_234 production = new Production4_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}