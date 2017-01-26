package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_2 {
    private final Production79_2 production = new Production79_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}