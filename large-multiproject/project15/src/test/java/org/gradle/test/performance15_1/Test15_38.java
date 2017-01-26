package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_38 {
    private final Production15_38 production = new Production15_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}