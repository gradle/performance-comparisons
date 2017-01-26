package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_297 {
    private final Production74_297 production = new Production74_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}