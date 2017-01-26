package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_431 {
    private final Production19_431 production = new Production19_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}