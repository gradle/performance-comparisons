package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_196 {
    private final Production20_196 production = new Production20_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}