package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_187 {
    private final Production95_187 production = new Production95_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}