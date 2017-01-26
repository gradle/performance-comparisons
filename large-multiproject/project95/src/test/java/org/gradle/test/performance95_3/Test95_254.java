package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_254 {
    private final Production95_254 production = new Production95_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}