package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_289 {
    private final Production74_289 production = new Production74_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}