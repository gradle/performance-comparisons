package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_373 {
    private final Production79_373 production = new Production79_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}