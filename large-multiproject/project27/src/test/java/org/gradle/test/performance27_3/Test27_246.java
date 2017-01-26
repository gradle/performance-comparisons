package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_246 {
    private final Production27_246 production = new Production27_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}