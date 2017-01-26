package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_107 {
    private final Production79_107 production = new Production79_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}