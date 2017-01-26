package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_161 {
    private final Production74_161 production = new Production74_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}