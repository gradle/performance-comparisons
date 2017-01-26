package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_495 {
    private final Production79_495 production = new Production79_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}