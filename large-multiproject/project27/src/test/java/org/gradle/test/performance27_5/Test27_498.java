package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_498 {
    private final Production27_498 production = new Production27_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}