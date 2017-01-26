package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_96 {
    private final Production15_96 production = new Production15_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}