package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_48 {
    private final Production74_48 production = new Production74_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}