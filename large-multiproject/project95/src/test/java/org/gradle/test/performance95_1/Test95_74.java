package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_74 {
    private final Production95_74 production = new Production95_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}