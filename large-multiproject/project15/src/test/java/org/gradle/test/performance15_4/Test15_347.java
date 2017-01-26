package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_347 {
    private final Production15_347 production = new Production15_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}