package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_147 {
    private final Production74_147 production = new Production74_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}