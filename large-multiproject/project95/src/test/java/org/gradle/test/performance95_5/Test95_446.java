package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_446 {
    private final Production95_446 production = new Production95_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}