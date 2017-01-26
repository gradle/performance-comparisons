package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_196 {
    private final Production51_196 production = new Production51_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}