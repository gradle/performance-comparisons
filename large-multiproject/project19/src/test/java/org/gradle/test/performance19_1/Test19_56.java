package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_56 {
    private final Production19_56 production = new Production19_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}