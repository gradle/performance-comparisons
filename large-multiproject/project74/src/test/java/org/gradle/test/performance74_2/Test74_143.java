package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_143 {
    private final Production74_143 production = new Production74_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}