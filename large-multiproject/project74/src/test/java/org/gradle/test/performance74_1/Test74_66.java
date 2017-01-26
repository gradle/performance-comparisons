package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_66 {
    private final Production74_66 production = new Production74_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}