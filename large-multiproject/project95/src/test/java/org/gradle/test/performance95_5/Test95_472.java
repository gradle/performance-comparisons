package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_472 {
    private final Production95_472 production = new Production95_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}