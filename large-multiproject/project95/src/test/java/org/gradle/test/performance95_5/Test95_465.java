package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_465 {
    private final Production95_465 production = new Production95_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}