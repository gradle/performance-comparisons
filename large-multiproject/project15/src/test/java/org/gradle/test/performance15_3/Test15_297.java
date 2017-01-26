package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_297 {
    private final Production15_297 production = new Production15_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}