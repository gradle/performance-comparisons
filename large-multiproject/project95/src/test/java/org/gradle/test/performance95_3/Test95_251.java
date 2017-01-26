package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_251 {
    private final Production95_251 production = new Production95_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}