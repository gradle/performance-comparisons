package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_188 {
    private final Production15_188 production = new Production15_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}