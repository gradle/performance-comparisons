package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_260 {
    private final Production79_260 production = new Production79_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}