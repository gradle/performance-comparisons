package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_234 {
    private final Production48_234 production = new Production48_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}