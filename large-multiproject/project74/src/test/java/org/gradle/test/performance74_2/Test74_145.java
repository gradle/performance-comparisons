package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_145 {
    private final Production74_145 production = new Production74_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}