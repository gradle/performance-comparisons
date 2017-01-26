package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_75 {
    private final Production79_75 production = new Production79_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}