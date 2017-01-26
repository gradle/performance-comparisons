package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_92 {
    private final Production20_92 production = new Production20_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}