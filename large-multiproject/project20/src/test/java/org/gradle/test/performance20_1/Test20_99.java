package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_99 {
    private final Production20_99 production = new Production20_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}