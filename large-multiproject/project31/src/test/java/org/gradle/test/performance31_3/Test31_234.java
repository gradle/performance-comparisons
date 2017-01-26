package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_234 {
    private final Production31_234 production = new Production31_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}