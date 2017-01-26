package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_235 {
    private final Production95_235 production = new Production95_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}