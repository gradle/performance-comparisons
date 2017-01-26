package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_197 {
    private final Production34_197 production = new Production34_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}