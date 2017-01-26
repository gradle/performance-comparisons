package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_234 {
    private final Production54_234 production = new Production54_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}