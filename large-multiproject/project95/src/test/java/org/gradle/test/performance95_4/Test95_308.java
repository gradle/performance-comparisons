package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_308 {
    private final Production95_308 production = new Production95_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}