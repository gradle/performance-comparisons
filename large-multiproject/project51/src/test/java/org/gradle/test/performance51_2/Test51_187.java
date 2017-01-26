package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_187 {
    private final Production51_187 production = new Production51_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}