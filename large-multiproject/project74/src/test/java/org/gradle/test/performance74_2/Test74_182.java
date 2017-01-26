package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_182 {
    private final Production74_182 production = new Production74_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}