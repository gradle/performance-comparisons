package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_388 {
    private final Production92_388 production = new Production92_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}