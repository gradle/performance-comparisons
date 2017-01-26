package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_362 {
    private final Production27_362 production = new Production27_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}