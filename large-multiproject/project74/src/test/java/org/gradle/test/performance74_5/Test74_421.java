package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_421 {
    private final Production74_421 production = new Production74_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}