package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_80 {
    private final Production15_80 production = new Production15_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}