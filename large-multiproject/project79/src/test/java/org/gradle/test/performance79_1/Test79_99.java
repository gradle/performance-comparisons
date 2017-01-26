package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_99 {
    private final Production79_99 production = new Production79_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}