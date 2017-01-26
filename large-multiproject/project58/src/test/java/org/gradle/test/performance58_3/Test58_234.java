package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_234 {
    private final Production58_234 production = new Production58_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}