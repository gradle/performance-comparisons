package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_56 {
    private final Production34_56 production = new Production34_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}