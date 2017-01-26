package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_246 {
    private final Production15_246 production = new Production15_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}