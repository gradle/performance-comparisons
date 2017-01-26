package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_12 {
    private final Production95_12 production = new Production95_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}