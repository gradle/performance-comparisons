package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_388 {
    private final Production20_388 production = new Production20_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}