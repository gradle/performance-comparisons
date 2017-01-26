package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_388 {
    private final Production74_388 production = new Production74_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}