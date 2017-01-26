package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_196 {
    private final Production74_196 production = new Production74_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}