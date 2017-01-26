package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_203 {
    private final Production74_203 production = new Production74_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}