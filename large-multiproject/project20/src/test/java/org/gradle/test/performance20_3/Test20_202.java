package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_202 {
    private final Production20_202 production = new Production20_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}