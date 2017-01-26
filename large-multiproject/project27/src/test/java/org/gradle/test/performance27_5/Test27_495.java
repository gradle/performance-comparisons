package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_495 {
    private final Production27_495 production = new Production27_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}