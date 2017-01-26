package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_336 {
    private final Production51_336 production = new Production51_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}