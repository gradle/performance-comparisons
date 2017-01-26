package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_350 {
    private final Production20_350 production = new Production20_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}