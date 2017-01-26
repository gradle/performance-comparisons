package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_147 {
    private final Production95_147 production = new Production95_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}