package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_37 {
    private final Production51_37 production = new Production51_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}