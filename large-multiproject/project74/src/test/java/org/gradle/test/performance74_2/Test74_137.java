package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_137 {
    private final Production74_137 production = new Production74_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}