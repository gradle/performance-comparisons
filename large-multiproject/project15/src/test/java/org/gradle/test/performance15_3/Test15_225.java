package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_225 {
    private final Production15_225 production = new Production15_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}