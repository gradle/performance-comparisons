package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_297 {
    private final Production20_297 production = new Production20_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}