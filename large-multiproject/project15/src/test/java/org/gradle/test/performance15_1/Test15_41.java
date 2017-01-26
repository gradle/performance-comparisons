package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_41 {
    private final Production15_41 production = new Production15_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}