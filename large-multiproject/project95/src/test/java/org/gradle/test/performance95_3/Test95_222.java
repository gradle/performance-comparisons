package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_222 {
    private final Production95_222 production = new Production95_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}