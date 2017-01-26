package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_104 {
    private final Production95_104 production = new Production95_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}