package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_127 {
    private final Production74_127 production = new Production74_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}