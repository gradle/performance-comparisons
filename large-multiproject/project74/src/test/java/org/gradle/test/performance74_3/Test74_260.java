package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_260 {
    private final Production74_260 production = new Production74_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}