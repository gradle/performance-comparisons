package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_412 {
    private final Production19_412 production = new Production19_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}