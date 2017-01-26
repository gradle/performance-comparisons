package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_441 {
    private final Production51_441 production = new Production51_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}