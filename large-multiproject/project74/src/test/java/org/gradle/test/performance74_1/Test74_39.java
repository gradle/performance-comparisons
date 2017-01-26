package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_39 {
    private final Production74_39 production = new Production74_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}