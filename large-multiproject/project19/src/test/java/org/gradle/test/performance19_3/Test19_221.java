package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_221 {
    private final Production19_221 production = new Production19_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}