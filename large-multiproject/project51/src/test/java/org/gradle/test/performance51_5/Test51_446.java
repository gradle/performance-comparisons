package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_446 {
    private final Production51_446 production = new Production51_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}