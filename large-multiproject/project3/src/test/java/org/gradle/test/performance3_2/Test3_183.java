package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_183 {
    private final Production3_183 production = new Production3_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}