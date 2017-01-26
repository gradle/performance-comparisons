package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_498 {
    private final Production44_498 production = new Production44_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}