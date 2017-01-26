package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_147 {
    private final Production15_147 production = new Production15_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}