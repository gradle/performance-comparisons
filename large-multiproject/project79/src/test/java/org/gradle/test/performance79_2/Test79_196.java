package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_196 {
    private final Production79_196 production = new Production79_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}