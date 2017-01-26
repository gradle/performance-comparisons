package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_329 {
    private final Production51_329 production = new Production51_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}