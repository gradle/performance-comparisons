package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_265 {
    private final Production51_265 production = new Production51_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}