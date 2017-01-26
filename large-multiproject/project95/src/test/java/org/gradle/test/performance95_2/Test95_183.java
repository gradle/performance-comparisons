package org.gradle.test.performance95_2;

import static org.junit.Assert.*;

public class Test95_183 {
    private final Production95_183 production = new Production95_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}