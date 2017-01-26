package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_34 {
    private final Production74_34 production = new Production74_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}