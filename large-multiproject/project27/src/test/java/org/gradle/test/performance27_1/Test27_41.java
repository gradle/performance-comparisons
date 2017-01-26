package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_41 {
    private final Production27_41 production = new Production27_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}