package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_202 {
    private final Production74_202 production = new Production74_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}