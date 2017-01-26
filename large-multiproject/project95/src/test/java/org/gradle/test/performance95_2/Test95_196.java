package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_196 {
    private final Production95_196 production = new Production95_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}