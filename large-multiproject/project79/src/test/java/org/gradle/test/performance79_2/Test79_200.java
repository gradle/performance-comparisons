package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_200 {
    private final Production79_200 production = new Production79_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}