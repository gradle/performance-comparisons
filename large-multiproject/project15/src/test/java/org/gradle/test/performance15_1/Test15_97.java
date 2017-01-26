package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_97 {
    private final Production15_97 production = new Production15_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}