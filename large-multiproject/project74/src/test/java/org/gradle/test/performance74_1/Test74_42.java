package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_42 {
    private final Production74_42 production = new Production74_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}