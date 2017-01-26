package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_98 {
    private final Production15_98 production = new Production15_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}