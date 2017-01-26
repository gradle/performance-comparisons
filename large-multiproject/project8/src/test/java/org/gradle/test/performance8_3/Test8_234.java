package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_234 {
    private final Production8_234 production = new Production8_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}