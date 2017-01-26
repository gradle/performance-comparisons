package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_134 {
    private final Production20_134 production = new Production20_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}