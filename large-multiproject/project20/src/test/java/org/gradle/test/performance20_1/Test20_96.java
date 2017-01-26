package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_96 {
    private final Production20_96 production = new Production20_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}