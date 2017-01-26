package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_35 {
    private final Production20_35 production = new Production20_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}