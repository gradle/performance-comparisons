package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_119 {
    private final Production95_119 production = new Production95_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}