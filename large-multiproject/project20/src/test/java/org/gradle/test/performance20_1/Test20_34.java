package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_34 {
    private final Production20_34 production = new Production20_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}