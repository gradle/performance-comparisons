package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_6 {
    private final Production51_6 production = new Production51_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}