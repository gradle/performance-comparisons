package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_304 {
    private final Production51_304 production = new Production51_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}