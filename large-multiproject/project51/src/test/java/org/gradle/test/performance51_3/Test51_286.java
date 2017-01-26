package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_286 {
    private final Production51_286 production = new Production51_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}