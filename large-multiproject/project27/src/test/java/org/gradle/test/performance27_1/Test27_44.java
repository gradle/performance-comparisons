package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_44 {
    private final Production27_44 production = new Production27_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}