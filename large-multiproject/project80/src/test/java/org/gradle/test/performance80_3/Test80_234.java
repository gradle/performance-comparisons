package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_234 {
    private final Production80_234 production = new Production80_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}