package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_34 {
    private final Production79_34 production = new Production79_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}