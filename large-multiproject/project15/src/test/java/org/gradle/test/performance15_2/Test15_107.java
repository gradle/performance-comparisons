package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_107 {
    private final Production15_107 production = new Production15_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}