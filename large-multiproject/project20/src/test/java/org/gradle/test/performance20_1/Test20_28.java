package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_28 {
    private final Production20_28 production = new Production20_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}