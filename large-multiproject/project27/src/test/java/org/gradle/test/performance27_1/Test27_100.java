package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_100 {
    private final Production27_100 production = new Production27_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}