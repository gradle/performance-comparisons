package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_285 {
    private final Production17_285 production = new Production17_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}