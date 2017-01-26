package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_498 {
    private final Production74_498 production = new Production74_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}