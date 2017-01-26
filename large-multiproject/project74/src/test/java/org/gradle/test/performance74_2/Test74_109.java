package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_109 {
    private final Production74_109 production = new Production74_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}