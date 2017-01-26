package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_294 {
    private final Production15_294 production = new Production15_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}