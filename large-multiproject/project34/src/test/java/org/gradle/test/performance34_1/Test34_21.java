package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_21 {
    private final Production34_21 production = new Production34_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}