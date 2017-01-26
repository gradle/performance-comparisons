package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_94 {
    private final Production34_94 production = new Production34_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}