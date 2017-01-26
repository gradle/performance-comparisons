package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_232 {
    private final Production95_232 production = new Production95_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}