package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_234 {
    private final Production25_234 production = new Production25_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}