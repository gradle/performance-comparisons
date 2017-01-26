package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_303 {
    private final Production27_303 production = new Production27_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}