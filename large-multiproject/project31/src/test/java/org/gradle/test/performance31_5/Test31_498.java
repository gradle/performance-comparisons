package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_498 {
    private final Production31_498 production = new Production31_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}