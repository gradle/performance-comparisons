package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_330 {
    private final Production27_330 production = new Production27_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}