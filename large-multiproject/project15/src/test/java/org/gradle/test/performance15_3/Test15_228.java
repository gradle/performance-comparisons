package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_228 {
    private final Production15_228 production = new Production15_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}