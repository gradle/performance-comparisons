package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_202 {
    private final Production15_202 production = new Production15_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}