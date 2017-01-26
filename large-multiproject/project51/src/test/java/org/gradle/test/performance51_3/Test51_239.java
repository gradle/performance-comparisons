package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_239 {
    private final Production51_239 production = new Production51_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}