package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_382 {
    private final Production15_382 production = new Production15_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}