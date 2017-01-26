package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_7 {
    private final Production95_7 production = new Production95_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}