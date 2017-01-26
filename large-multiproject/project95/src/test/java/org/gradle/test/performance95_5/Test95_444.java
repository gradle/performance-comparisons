package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_444 {
    private final Production95_444 production = new Production95_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}