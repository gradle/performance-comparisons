package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_214 {
    private final Production74_214 production = new Production74_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}