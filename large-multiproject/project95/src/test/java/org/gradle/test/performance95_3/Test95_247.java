package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_247 {
    private final Production95_247 production = new Production95_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}