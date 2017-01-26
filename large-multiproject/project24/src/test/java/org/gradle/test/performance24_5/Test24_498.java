package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_498 {
    private final Production24_498 production = new Production24_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}