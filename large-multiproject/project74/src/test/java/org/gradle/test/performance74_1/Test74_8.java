package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_8 {
    private final Production74_8 production = new Production74_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}