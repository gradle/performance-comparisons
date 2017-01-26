package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_432 {
    private final Production79_432 production = new Production79_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}