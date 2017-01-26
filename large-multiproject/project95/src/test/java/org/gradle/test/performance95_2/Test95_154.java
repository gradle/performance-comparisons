package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_154 {
    private final Production95_154 production = new Production95_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}