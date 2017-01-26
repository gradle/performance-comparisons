package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_325 {
    private final Production27_325 production = new Production27_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}