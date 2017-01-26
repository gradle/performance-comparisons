package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_28 {
    private final Production74_28 production = new Production74_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}