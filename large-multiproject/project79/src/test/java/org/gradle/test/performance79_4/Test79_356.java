package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_356 {
    private final Production79_356 production = new Production79_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}