package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_131 {
    private final Production19_131 production = new Production19_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}