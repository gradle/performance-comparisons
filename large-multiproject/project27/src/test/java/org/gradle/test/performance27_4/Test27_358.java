package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_358 {
    private final Production27_358 production = new Production27_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}