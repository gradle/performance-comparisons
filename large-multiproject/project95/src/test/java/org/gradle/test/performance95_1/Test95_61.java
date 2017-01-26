package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_61 {
    private final Production95_61 production = new Production95_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}