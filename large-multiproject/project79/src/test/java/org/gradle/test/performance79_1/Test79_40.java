package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_40 {
    private final Production79_40 production = new Production79_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}