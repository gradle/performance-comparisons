package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_251 {
    private final Production15_251 production = new Production15_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}