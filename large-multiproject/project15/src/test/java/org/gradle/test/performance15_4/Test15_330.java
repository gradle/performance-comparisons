package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_330 {
    private final Production15_330 production = new Production15_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}