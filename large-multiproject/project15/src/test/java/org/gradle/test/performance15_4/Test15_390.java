package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_390 {
    private final Production15_390 production = new Production15_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}