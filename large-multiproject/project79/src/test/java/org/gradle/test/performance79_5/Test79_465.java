package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_465 {
    private final Production79_465 production = new Production79_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}