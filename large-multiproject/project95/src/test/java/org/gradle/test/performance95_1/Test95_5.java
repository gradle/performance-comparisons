package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_5 {
    private final Production95_5 production = new Production95_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}