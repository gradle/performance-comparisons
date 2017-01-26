package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_8 {
    private final Production20_8 production = new Production20_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}