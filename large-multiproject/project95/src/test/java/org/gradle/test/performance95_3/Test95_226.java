package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_226 {
    private final Production95_226 production = new Production95_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}