package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_477 {
    private final Production74_477 production = new Production74_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}