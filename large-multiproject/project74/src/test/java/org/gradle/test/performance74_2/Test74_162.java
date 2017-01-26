package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_162 {
    private final Production74_162 production = new Production74_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}