package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_498 {
    private final Production15_498 production = new Production15_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}