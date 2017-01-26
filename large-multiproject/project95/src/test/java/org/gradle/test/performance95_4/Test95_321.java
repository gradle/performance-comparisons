package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_321 {
    private final Production95_321 production = new Production95_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}