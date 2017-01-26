package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_261 {
    private final Production95_261 production = new Production95_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}