package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_370 {
    private final Production95_370 production = new Production95_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}