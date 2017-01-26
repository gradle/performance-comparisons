package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_373 {
    private final Production95_373 production = new Production95_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}