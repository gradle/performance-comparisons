package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_360 {
    private final Production95_360 production = new Production95_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}