package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_270 {
    private final Production51_270 production = new Production51_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}