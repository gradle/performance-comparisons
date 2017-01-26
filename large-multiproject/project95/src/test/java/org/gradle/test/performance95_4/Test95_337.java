package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_337 {
    private final Production95_337 production = new Production95_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}