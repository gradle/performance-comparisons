package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_234 {
    private final Production41_234 production = new Production41_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}