package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_260 {
    private final Production95_260 production = new Production95_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}