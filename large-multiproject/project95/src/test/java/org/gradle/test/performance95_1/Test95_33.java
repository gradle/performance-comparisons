package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_33 {
    private final Production95_33 production = new Production95_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}