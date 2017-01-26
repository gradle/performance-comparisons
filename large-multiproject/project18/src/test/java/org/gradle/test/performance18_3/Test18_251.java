package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_251 {
    private final Production18_251 production = new Production18_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}