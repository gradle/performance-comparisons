package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_72 {
    private final Production15_72 production = new Production15_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}