package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_294 {
    private final Production27_294 production = new Production27_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}