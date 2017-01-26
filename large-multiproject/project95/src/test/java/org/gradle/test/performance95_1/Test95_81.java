package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_81 {
    private final Production95_81 production = new Production95_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}