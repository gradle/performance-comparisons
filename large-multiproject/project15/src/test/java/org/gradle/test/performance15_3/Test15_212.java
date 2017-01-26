package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_212 {
    private final Production15_212 production = new Production15_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}