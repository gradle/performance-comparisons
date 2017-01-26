package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_213 {
    private final Production95_213 production = new Production95_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}