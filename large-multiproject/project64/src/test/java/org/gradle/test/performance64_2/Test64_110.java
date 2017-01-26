package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_110 {
    private final Production64_110 production = new Production64_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}