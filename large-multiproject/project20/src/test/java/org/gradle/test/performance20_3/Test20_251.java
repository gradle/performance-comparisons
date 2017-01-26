package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_251 {
    private final Production20_251 production = new Production20_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}