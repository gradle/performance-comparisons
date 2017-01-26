package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_137 {
    private final Production95_137 production = new Production95_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}