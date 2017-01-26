package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_62 {
    private final Production15_62 production = new Production15_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}