package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_82 {
    private final Production79_82 production = new Production79_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}