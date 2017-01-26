package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_216 {
    private final Production95_216 production = new Production95_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}