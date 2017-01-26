package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_442 {
    private final Production74_442 production = new Production74_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}