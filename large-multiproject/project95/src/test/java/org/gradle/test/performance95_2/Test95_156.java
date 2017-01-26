package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_156 {
    private final Production95_156 production = new Production95_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}