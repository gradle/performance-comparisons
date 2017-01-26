package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_435 {
    private final Production74_435 production = new Production74_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}