package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_134 {
    private final Production95_134 production = new Production95_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}