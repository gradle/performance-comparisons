package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_395 {
    private final Production74_395 production = new Production74_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}