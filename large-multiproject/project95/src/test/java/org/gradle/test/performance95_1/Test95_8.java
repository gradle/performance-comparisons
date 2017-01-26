package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_8 {
    private final Production95_8 production = new Production95_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}