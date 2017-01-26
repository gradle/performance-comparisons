package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_44 {
    private final Production15_44 production = new Production15_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}