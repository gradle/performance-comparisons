package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_186 {
    private final Production74_186 production = new Production74_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}