package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_48 {
    private final Production51_48 production = new Production51_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}