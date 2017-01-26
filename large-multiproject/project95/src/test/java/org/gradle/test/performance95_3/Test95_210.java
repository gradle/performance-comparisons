package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_210 {
    private final Production95_210 production = new Production95_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}