package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_293 {
    private final Production79_293 production = new Production79_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}