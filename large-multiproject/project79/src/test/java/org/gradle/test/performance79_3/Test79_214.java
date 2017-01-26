package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_214 {
    private final Production79_214 production = new Production79_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}