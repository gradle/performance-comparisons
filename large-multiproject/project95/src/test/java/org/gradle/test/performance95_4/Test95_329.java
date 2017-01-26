package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_329 {
    private final Production95_329 production = new Production95_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}