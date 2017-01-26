package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_196 {
    private final Production15_196 production = new Production15_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}