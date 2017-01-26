package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_388 {
    private final Production58_388 production = new Production58_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}