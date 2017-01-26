package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_215 {
    private final Production15_215 production = new Production15_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}