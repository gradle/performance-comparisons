package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_409 {
    private final Production34_409 production = new Production34_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}