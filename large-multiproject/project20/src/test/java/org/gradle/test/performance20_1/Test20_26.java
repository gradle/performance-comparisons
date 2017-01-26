package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_26 {
    private final Production20_26 production = new Production20_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}