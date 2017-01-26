package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_251 {
    private final Production7_251 production = new Production7_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}