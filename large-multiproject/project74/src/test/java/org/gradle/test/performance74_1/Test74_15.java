package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_15 {
    private final Production74_15 production = new Production74_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}