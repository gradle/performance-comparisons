package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_217 {
    private final Production95_217 production = new Production95_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}