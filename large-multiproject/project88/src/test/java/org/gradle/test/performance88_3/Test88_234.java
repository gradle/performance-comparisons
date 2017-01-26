package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_234 {
    private final Production88_234 production = new Production88_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}