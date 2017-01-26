package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_367 {
    private final Production51_367 production = new Production51_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}