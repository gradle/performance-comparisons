package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_157 {
    private final Production15_157 production = new Production15_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}