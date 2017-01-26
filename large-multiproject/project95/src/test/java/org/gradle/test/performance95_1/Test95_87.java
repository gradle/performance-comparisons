package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_87 {
    private final Production95_87 production = new Production95_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}