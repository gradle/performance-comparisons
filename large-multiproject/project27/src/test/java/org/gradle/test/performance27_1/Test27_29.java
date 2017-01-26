package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_29 {
    private final Production27_29 production = new Production27_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}