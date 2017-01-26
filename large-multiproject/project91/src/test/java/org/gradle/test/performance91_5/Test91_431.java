package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_431 {
    private final Production91_431 production = new Production91_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}