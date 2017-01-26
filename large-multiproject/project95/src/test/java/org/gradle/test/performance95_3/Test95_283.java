package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_283 {
    private final Production95_283 production = new Production95_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}