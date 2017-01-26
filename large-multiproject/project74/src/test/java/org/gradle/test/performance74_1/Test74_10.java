package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_10 {
    private final Production74_10 production = new Production74_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}