package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_203 {
    private final Production95_203 production = new Production95_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}