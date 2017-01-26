package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_379 {
    private final Production19_379 production = new Production19_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}