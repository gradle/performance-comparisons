package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_110 {
    private final Production19_110 production = new Production19_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}