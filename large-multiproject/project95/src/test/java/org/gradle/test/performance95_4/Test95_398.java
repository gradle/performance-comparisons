package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_398 {
    private final Production95_398 production = new Production95_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}