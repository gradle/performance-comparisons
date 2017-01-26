package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_286 {
    private final Production74_286 production = new Production74_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}