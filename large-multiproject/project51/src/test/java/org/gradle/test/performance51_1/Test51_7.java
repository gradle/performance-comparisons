package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_7 {
    private final Production51_7 production = new Production51_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}