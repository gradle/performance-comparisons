package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_431 {
    private final Production64_431 production = new Production64_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}