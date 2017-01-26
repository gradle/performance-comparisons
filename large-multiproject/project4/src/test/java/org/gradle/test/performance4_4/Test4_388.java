package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_388 {
    private final Production4_388 production = new Production4_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}