package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_111 {
    private final Production95_111 production = new Production95_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}