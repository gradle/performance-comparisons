package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_51 {
    private final Production20_51 production = new Production20_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}