package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_495 {
    private final Production95_495 production = new Production95_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}