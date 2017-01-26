package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_183 {
    private final Production30_183 production = new Production30_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}