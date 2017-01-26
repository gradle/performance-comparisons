package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_58 {
    private final Production15_58 production = new Production15_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}