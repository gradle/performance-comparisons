package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_234 {
    private final Production98_234 production = new Production98_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}