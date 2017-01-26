package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_100 {
    private final Production79_100 production = new Production79_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}