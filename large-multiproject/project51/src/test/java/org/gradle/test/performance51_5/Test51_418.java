package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_418 {
    private final Production51_418 production = new Production51_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}