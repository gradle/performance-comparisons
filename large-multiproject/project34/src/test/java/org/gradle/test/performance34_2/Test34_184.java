package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_184 {
    private final Production34_184 production = new Production34_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}