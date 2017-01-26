package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_309 {
    private final Production74_309 production = new Production74_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}