package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_381 {
    private final Production19_381 production = new Production19_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}