package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_286 {
    private final Production15_286 production = new Production15_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}