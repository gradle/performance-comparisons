package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_258 {
    private final Production79_258 production = new Production79_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}