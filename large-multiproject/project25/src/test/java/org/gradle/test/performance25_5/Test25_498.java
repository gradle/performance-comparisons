package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_498 {
    private final Production25_498 production = new Production25_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}