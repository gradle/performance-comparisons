package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_341 {
    private final Production95_341 production = new Production95_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}