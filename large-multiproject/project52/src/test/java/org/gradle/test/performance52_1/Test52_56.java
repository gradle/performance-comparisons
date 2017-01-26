package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_56 {
    private final Production52_56 production = new Production52_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}