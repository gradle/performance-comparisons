package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_106 {
    private final Production27_106 production = new Production27_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}