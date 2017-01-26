package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_135 {
    private final Production74_135 production = new Production74_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}