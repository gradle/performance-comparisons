package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_98 {
    private final Production20_98 production = new Production20_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}