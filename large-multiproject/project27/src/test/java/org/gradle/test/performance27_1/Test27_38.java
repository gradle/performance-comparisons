package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_38 {
    private final Production27_38 production = new Production27_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}