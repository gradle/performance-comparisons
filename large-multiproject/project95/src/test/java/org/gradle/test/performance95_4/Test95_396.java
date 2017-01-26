package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_396 {
    private final Production95_396 production = new Production95_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}