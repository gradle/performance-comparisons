package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_234 {
    private final Production75_234 production = new Production75_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}