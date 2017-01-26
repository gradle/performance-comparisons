package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_186 {
    private final Production95_186 production = new Production95_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}