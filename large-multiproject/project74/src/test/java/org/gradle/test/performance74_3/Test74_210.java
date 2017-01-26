package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_210 {
    private final Production74_210 production = new Production74_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}