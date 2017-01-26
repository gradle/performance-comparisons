package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_188 {
    private final Production74_188 production = new Production74_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}