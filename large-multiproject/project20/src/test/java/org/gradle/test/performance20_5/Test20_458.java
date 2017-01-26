package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_458 {
    private final Production20_458 production = new Production20_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}