package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_5 {
    private final Production51_5 production = new Production51_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}