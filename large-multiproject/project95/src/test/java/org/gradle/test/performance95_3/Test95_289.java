package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_289 {
    private final Production95_289 production = new Production95_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}