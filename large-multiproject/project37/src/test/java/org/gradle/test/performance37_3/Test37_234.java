package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_234 {
    private final Production37_234 production = new Production37_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}