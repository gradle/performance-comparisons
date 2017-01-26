package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_330 {
    private final Production51_330 production = new Production51_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}