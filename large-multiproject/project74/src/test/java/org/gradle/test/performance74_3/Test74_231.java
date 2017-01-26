package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_231 {
    private final Production74_231 production = new Production74_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}