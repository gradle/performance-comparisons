package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_154 {
    private final Production51_154 production = new Production51_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}