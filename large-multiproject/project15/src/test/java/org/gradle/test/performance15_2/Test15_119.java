package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_119 {
    private final Production15_119 production = new Production15_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}