package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_281 {
    private final Production15_281 production = new Production15_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}