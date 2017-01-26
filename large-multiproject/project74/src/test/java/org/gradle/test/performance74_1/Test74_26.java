package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_26 {
    private final Production74_26 production = new Production74_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}