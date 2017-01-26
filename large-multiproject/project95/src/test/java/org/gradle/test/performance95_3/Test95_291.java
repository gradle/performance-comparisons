package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_291 {
    private final Production95_291 production = new Production95_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}