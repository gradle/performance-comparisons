package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_367 {
    private final Production74_367 production = new Production74_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}