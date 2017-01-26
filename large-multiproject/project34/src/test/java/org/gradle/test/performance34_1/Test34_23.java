package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_23 {
    private final Production34_23 production = new Production34_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}