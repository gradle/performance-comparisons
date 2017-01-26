package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_171 {
    private final Production19_171 production = new Production19_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}