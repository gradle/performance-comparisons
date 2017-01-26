package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_450 {
    private final Production51_450 production = new Production51_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}