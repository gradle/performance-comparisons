package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_43 {
    private final Production15_43 production = new Production15_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}