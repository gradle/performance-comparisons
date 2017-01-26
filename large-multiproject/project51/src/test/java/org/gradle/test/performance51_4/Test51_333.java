package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_333 {
    private final Production51_333 production = new Production51_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}