package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_303 {
    private final Production51_303 production = new Production51_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}