package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_154 {
    private final Production74_154 production = new Production74_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}