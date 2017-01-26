package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_462 {
    private final Production19_462 production = new Production19_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}