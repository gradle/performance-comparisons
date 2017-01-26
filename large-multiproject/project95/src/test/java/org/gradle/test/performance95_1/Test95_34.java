package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_34 {
    private final Production95_34 production = new Production95_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}