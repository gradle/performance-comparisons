package org.gradle.test.performance95_4;

import static org.junit.Assert.*;

public class Test95_323 {
    private final Production95_323 production = new Production95_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}