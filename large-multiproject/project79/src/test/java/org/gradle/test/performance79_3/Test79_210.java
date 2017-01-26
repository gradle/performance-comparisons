package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_210 {
    private final Production79_210 production = new Production79_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}