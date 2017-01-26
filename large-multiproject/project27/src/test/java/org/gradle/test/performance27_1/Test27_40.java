package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_40 {
    private final Production27_40 production = new Production27_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}