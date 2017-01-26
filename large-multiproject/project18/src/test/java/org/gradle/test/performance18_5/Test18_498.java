package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_498 {
    private final Production18_498 production = new Production18_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}