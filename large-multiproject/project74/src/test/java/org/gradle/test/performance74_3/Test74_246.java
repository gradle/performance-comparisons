package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_246 {
    private final Production74_246 production = new Production74_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}