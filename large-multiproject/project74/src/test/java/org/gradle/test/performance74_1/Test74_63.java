package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_63 {
    private final Production74_63 production = new Production74_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}