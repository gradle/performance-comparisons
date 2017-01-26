package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_281 {
    private final Production95_281 production = new Production95_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}