package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_309 {
    private final Production95_309 production = new Production95_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}