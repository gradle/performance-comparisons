package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_244 {
    private final Production95_244 production = new Production95_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}