package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_424 {
    private final Production17_424 production = new Production17_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}