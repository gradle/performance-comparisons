package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_267 {
    private final Production15_267 production = new Production15_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}