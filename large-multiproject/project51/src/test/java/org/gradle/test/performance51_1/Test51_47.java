package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_47 {
    private final Production51_47 production = new Production51_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}