package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_210 {
    private final Production51_210 production = new Production51_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}