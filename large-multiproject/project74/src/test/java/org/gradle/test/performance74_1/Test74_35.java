package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_35 {
    private final Production74_35 production = new Production74_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}