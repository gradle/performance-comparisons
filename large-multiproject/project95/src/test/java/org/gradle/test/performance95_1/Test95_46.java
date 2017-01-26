package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_46 {
    private final Production95_46 production = new Production95_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}