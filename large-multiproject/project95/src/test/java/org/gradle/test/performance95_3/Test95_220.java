package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_220 {
    private final Production95_220 production = new Production95_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}