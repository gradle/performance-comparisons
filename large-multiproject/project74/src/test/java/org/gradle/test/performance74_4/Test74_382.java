package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_382 {
    private final Production74_382 production = new Production74_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}