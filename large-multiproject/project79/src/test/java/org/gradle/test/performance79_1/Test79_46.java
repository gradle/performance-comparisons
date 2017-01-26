package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_46 {
    private final Production79_46 production = new Production79_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}