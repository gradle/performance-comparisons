package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_414 {
    private final Production51_414 production = new Production51_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}