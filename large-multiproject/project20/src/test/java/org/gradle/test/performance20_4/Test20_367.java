package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_367 {
    private final Production20_367 production = new Production20_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}