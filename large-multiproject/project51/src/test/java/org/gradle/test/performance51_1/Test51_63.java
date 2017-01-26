package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_63 {
    private final Production51_63 production = new Production51_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}