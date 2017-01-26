package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_172 {
    private final Production79_172 production = new Production79_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}