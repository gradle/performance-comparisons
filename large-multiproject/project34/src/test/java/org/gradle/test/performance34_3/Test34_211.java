package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_211 {
    private final Production34_211 production = new Production34_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}